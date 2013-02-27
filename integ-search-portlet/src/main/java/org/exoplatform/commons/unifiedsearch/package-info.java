/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

@Application
@Portlet
@Assets(
    scripts = {
        @Script(id = "jquery", src = "jquery-1.7.1.min.js", location = AssetLocation.CLASSPATH),
        @Script(id = "search.js", src = "search.js", location = AssetLocation.CLASSPATH),
        @Script(id = "search-setting.js", src = "search-setting.js", location = AssetLocation.CLASSPATH)
    },
    stylesheets = {
        @Stylesheet(src = "style/search.css", location = AssetLocation.CLASSPATH),
        @Stylesheet(src = "style/search-setting.css", location = AssetLocation.CLASSPATH)
    }    
)
package org.exoplatform.commons.unifiedsearch;

import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;
import juzu.plugin.asset.Stylesheet;
import juzu.plugin.portlet.Portlet;