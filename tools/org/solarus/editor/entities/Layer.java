/*
 * Copyright (C) 2006-2012 Christopho, Solarus - http://www.solarus-games.org
 *
 * Solarus Quest Editor is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Zelda: Mystery of Solarus DX is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.solarus.editor.entities;

/**
 * Enumeration of the layer property of the entities.
 */
public enum Layer {

    LOW,
    INTERMEDIATE,
    HIGH;

    public static final String[] humanNames = {
        "Low",
        "Intermediate",
        "High",
    };

    /**
     * Returns the value with the specified id.
     * @param id id of the value to get
     * @return the value with this id
     */
    public static Layer get(int id) {
        return values()[id];
    }

    /**
     * Returns the id of this value.
     * @return the id
     */
    public int getId() {
        return ordinal();
    }
}
