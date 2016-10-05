/*
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ol3cesium.client.olx;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AttributionOptions extends JavaScriptObject {
    protected AttributionOptions() {
        //
    }
    
    public static native AttributionOptions create() /*-{
        return {};
    }-*/;
    
    public static native AttributionOptions create(String html) /*-{
        return {html: html};
    }-*/;
    
    /**
     * 
     * @param html HTML markup for this attribution. Required.
     */
    public final native void setHtml(String html) /*-{
        this.html = html;
    }-*/;
}
