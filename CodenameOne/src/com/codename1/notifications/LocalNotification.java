/*
 * Copyright (c) 2012, Codename One and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Codename One designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *  
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Codename One through http://www.codenameone.com/ if you 
 * need additional information or have any questions.
 */
package com.codename1.notifications;


/**
 * <p>Local notifications are user notifications that are scheduled by the app itself. They 
 * are very similar to push notifications, except that they originate locally, rather than
 * remotely.</p>
 * 
 * <p>
 * They enable an app that isn’t running in the foreground to let its users know it 
 * has information for them. The information could be a message, an impending calendar 
 * event, or new data on a remote server. They can display an alert message or 
 * they can badge the app icon. They can also play a sound when the alert or badge 
 * number is shown.
 * </p>
 * <p>
 * When users are notified that the app has a message, event, or other data for them, 
 * they can launch the app and see the details. They can also choose to ignore the notification, 
 * in which case the app is not activated.
 * </p>
 * 
 * <p>This class encapsulates a single notification (though the notification can 
 * be repeating).  Its usage is very similar to <code>java.util.Timer</code> and 
 * <code>java.util.TimerTask</code>.
 * 
 * <h3>Usage</h3>
 * <code><pre>
 * LocalNotification n = new LocalNotification();
 * n.setId("hello"); // An ID for the notification.
 * n.setAlertBody("Some content");  // A description to be displayed for the notification
 * n.setAlertTitle("Hello World");  // Title to be displayed for notification
 * n.setRepeatType(LocalNotification.REPEAT_HOUR); // repeat every hour
 * n.setFireDate(System.currentTimeMillis()+5000); // start in 5 seconds.
 * Display.getInstance().sendLocalNotification(n);
 * </pre></code>
 * 
 * @author shannah
 * @see com.codename1.ui.Display#sendLocalNotification(com.codename1.notifications.LocalNotification) 
 * @see com.codename1.ui.Display#cancelLocalNotification(java.lang.String) 
 * @see com.codename1.ui.Display#cancelAllLocalNotifications() 
 */
public class LocalNotification {
    
    /**
     * Constant used in {@link #setRepeatType(int) } to indicate that this
     * notification should not be repeated.
     */
    public static final int REPEAT_NONE=0;
    
    /**
     * Constant used in {@link #setRepeatType(int) } to indicate that this
     * notification should be repeated every second.
     */
    public static final int REPEAT_SECOND=1;
    
    /**
     * Constant used in {@link #setRepeatType(int) } to indicate that this
     * notification should be repeated every minute.
     */
    public static final int REPEAT_MINUTE=2;
    
    /**
     * Constant used in {@link #setRepeatType(int) } to indicate that this
     * notification should be repeated every hour.
     */
    public static final int REPEAT_HOUR=3;
    
    /**
     * Constant used in {@link #setRepeatType(int) } to indicate that this
     * notification should be repeated every day.
     */
    public static final int REPEAT_DAY=4;
    
    /**
     * Constant used in {@link #setRepeatType(int) } to indicate that this
     * notification should be repeated every week.
     */
    public static final int REPEAT_WEEK=5;
    
    // We don't support month or year right now because it is too complicated
    // to keep track of leap years, and days in month on platforms that only 
    // support repeat by milliseconds etc..
    
    private String id;
    private int badgeNumber;
    private int repeatType;
    private long fireDate;
    private String alertBody;
    private String alertTitle;
    private String alertLaunchImage;
    private String alertSound;
   

    /**
     * Creates a new local notification with the fireDate in 10 milliseconds.
     */
    public LocalNotification() {
        fireDate = System.currentTimeMillis()+10;
    }
    
    /**
     * Gets the badge number to set for this notification.
     * @return the badgeNumber
     */
    public int getBadgeNumber() {
        return badgeNumber;
    }

    /**
     * Gets the badge number to set for this notification.
     * @param badgeNumber the badgeNumber to set
     */
    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    /**
     * Gets the repeat type for this notification.  Should be one of {@link #REPEAT_DAY},
     * {@link #REPEAT_HOUR}, {@link #REPEAT_WEEK}, {@link #REPEAT_MINUTE}, {@link #REPEAT_SECOND},
     * or {@link #REPEAT_NONE}.
     * @return the repeatInterval
     */
    public int getRepeatType() {
        return repeatType;
    }

    /**
     * Sets the repeat type for this notification.  Should be one of {@link #REPEAT_DAY},
     * {@link #REPEAT_HOUR}, {@link #REPEAT_WEEK}, {@link #REPEAT_MINUTE}, {@link #REPEAT_SECOND},
     * or {@link #REPEAT_NONE}.
     * @param repeatType the repeatInterval to set
     */
    public void setRepeatType(int repeatType) {
        this.repeatType = repeatType;
    }

    /**
     * @return the fireDate
     */
    public long getFireDate() {
        return fireDate;
    }

    /**
     * Sets the fire date for this notification.  (In milliseconds since epoch).
     * @param fireDate the fireDate to set
     */
    public void setFireDate(long fireDate) {
        this.fireDate = fireDate;
    }

    /**
     * Gets the alert body to be displayed for this notification.
     * @return the alertBody
     */
    public String getAlertBody() {
        return alertBody;
    }

    /**
     * Sets the alert body to be displayed for this notification.
     * @param alertBody the alertBody to set
     */
    public void setAlertBody(String alertBody) {
        this.alertBody = alertBody;
    }

    /**
     * Gets the alert title to be displayed for this notification.
     * @return the alertTitle
     */
    public String getAlertTitle() {
        return alertTitle;
    }

    /**
     * Sets the alert title to be displayed for this notification.
     * @param alertTitle the alertTitle to set
     */
    public void setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
    }

    /**
     * Gets the launch image to be displayed for this notification.  This should refer to 
     * an image that is bundled in the default package of the app.
     * @return the alertLaunchImage
     */
    public String getAlertLaunchImage() {
        return alertLaunchImage;
    }

    /**
     * Gets the launch image to be displayed for this notification.  This should refer to 
     * an image that is bundled in the default package of the app.
     * 
     * @param alertLaunchImage the alertLaunchImage to set
     */
    public void setAlertLaunchImage(String alertLaunchImage) {
        this.alertLaunchImage = alertLaunchImage;
    }

    /**
     * Gets the alert sound to be sounded when the notification arrives.  This 
     * should refer to a sound file that is bundled in the default package of your
     * app.
     * @return the alertSound
     */
    public String getAlertSound() {
        return alertSound;
    }

    /**
     * Sets the alert sound to be sounded when the notification arrives.  This 
     * should refer to a sound file that is bundled in the default package of your
     * app.
     * @param alertSound the alertSound to set
     */
    public void setAlertSound(String alertSound) {
        this.alertSound = alertSound;
    }

    /**
     * Gets the ID of the notification.  The ID is the only information that is
     * passed to {@link LocalNotificationCallback#localNotificationReceived(java.lang.String) }
     * so you can use it as a lookup key to retrieve the rest of the information as required
     * from storage or some other mechanism.
     * 
     * The ID can also be used to cancel the notification later using {@link com.codename1.ui.Display#cancelLocalNotification(java.lang.String) }
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the notification.  The ID is the only information that is
     * passed to {@link LocalNotificationCallback#localNotificationReceived(java.lang.String) }
     * so you can use it as a lookup key to retrieve the rest of the information as required
     * from storage or some other mechanism.
     * 
     * The ID can also be used to cancel the notification later using {@link com.codename1.ui.Display#cancelLocalNotification(java.lang.String) }
     * 
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
