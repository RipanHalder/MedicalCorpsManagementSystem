/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Maps;

import Business.Enterprise.Enterprise;
import Business.Organizations.MedicalCampOrganization;
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ripan Halder
 */
public class GoogleMaps {

    public static final int MIN_ZOOM = 0;
    public static final int MAX_ZOOM = 21;
    private Enterprise enterprise;
    /**
     * In map.html file default zoom value is set to 4.
     */
    private static int zoomValue = 4;

    public void fetchGoogleMap(String longitude, String latitude, Enterprise enterprise) {
        try {
            this.enterprise = enterprise;
            final Browser browser = new Browser();
            BrowserView browserView = new BrowserView(browser);

            JButton zoomInButton = new JButton("Zoom In");
            zoomInButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (zoomValue < MAX_ZOOM) {
                        browser.executeJavaScript("map.setZoom(" + ++zoomValue + ")");
                    }
                }
            });

            JButton zoomOutButton = new JButton("Zoom Out");
            zoomOutButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (zoomValue > MIN_ZOOM) {
                        browser.executeJavaScript("map.setZoom(" + --zoomValue + ")");
                    }
                }
            });

            JButton setMarkerButton = new JButton("Locate Our Military Camp");
            setMarkerButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    browser.executeJavaScript("var myLatlng = new google.maps.LatLng(" + longitude + "," + latitude + ");\n"
                            + "var marker = new google.maps.Marker({\n"
                            + "    position: myLatlng,\n"
                            + "    map: map,\n"
                            + "    title: 'Camp Location'\n"
                            + "});");

                }
            });

            JButton setMarkerButton2 = new JButton("Locate all Medical Camps");
            setMarkerButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof MedicalCampOrganization) {
                            browser.executeJavaScript("var myLatlng = new google.maps.LatLng(" + o.getLongitute() + "," + o.getLatitute() + ");\n"
                                    + "var marker = new google.maps.Marker({\n"
                                    + "    position: myLatlng,\n"
                                    + "    map: map,\n"
                                    + "    title: '" + o.getName() + "'\n"
                                    + "});");
                        }
                    }
                }
            });

            JPanel toolBar = new JPanel();
            toolBar.add(zoomInButton);
            toolBar.add(zoomOutButton);
            toolBar.add(setMarkerButton);
            toolBar.add(setMarkerButton2);

            JFrame frame = new JFrame("map.html");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.add(toolBar, BorderLayout.SOUTH);
            frame.add(browserView, BorderLayout.CENTER);
            frame.setSize(900, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            browser.loadURL("C:\\Users\\Ripan Halder\\AEDFinalProject\\medicalcorpsmanagementsystem\\map.html");

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }
}
