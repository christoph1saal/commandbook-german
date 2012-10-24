// $Id$
/*
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.commandbook.kits;

import java.util.Map;

/**
 * Manager for kits.
 *
 * @author sk89q
 */
public interface KitManager {

    /**
     * Load kits from file.
     */
    public void load();

    /**
     * Get a kit by name.
     *
     * @param id The name to get a kit by
     * @return The kit with the given id, if it exists.
     */
    public Kit getKit(String id);

    /**
     * Get a list of kits.
     *
     * @return The kits currently loaded
     */
    public Map<String, Kit> getKits();

    /**
     * Get rid of old information.
     */
    public void flush();
}
