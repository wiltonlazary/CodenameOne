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
 *
 * @author shannah
 */
public class LocalNotification {
    
    public static final int REPEAT_NONE=0;
    public static final int REPEAT_SECOND=1;
    public static final int REPEAT_MINUTE=2;
    public static final int REPEAT_HOUR=3;
    public static final int REPEAT_DAY=4;
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
   

    public LocalNotification() {
        fireDate = System.currentTimeMillis();
    }
    
    /**
     * @return the badgeNumber
     */
    public int getBadgeNumber() {
        return badgeNumber;
    }

    /**
     * @param badgeNumber the badgeNumber to set
     */
    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    /**
     * @return the repeatInterval
     */
    public int getRepeatType() {
        return repeatType;
    }

    /**
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
     * @param fireDate the fireDate to set
     */
    public void setFireDate(long fireDate) {
        this.fireDate = fireDate;
    }

    /**
     * @return the alertBody
     */
    public String getAlertBody() {
        return alertBody;
    }

    /**
     * @param alertBody the alertBody to set
     */
    public void setAlertBody(String alertBody) {
        this.alertBody = alertBody;
    }

    /**
     * @return the alertTitle
     */
    public String getAlertTitle() {
        return alertTitle;
    }

    /**
     * @param alertTitle the alertTitle to set
     */
    public void setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
    }

    /**
     * @return the alertLaunchImage
     */
    public String getAlertLaunchImage() {
        return alertLaunchImage;
    }

    /**
     * @param alertLaunchImage the alertLaunchImage to set
     */
    public void setAlertLaunchImage(String alertLaunchImage) {
        this.alertLaunchImage = alertLaunchImage;
    }

    /**
     * @return the alertSound
     */
    public String getAlertSound() {
        return alertSound;
    }

    /**
     * @param alertSound the alertSound to set
     */
    public void setAlertSound(String alertSound) {
        this.alertSound = alertSound;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
