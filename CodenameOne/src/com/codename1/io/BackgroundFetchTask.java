/*
 * Copyright (c) 2015, Codename One and/or its affiliates. All rights reserved.
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
package com.codename1.io;

/**
 * A callback to be implemented to handle periodical background fetching of 
 * new data for an application.  Use the build hint "BackgroundFetchTask" to specify
 * the fully-qualified class name that handles these fetches.
 * 
 * @see com.codename1.ui.Display#BACKGROUND_FETCH_SUPPORT_BACKGROUND
 * @see com.codename1.ui.Display#BACKGROUND_FETCH_SUPPORT_FOREGROUND
 * @see com.codename1.ui.Display#startBackgroundFetchService(com.codename1.io.BackgroundFetchTask) 
 * @see com.codename1.ui.Display#stopBackgroundFetchService() 
 * @see com.codename1.ui.Display#isBackgroundFetchServiceRunning() 
 * @see com.codename1.ui.Display#getBackgroundFetchSupport() 
 * 
 * @author Steve Hannah
 */
public interface BackgroundFetchTask {
    
    /**
     * Constant to return from {@link #performFetch() } when no data was retrieved.
     */
    public static final int RESULT_NO_DATA=1;
    
    /**
     * Constant to return from {@link #performFetch() } when new data was retrieved.
     */
    public static final int RESULT_NEW_DATA=2;
    
    /**
     * Constant to return from {@link #performFetch() } when the request for data failed.
     */
    public static final int RESULT_FAILED=3;
    
    /**
     * <p>Performs a background fetch.  When background fetch is enabled, then
     * this will be called periodically, and perhaps even when the app is running
     * in the background.  It must return one of {@link #RESULT_NO_DATA}, {@link #RESULT_NEW_DATA}, 
     * or {@link #RESULT_FAILED} to indicate the result of the fetch.
     * @return one of {@link #RESULT_NO_DATA}, {@link #RESULT_NEW_DATA}, 
     * or {@link #RESULT_FAILED} to indicate the result of the fetch.</p>
     * 
     * <p>Note: On iOS this method must return in under 30 seconds or it will be killed.  In addition,
     * you are encouraged to return as quickly as possible, as long-running fetches may be de-prioritized
     * by the OS causing the fetch to not be called as frequently.</p>
     */
    public int performFetch();
    
    /**
     * Returns the preferred interval for background fetches to occur. (in seconds)
     * @return The preferred interval for background fetches (in seconds).  Returning zero or a negative number here will
     * cause the OS to just use the minimum value available.
     */
    public int getPreferredInterval();
}
