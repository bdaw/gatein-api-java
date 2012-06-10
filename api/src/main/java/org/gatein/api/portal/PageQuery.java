/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.gatein.api.portal;

import org.gatein.api.commons.Query;
import org.gatein.api.commons.Range;

/**
 * Template
 *
 * @author <a href="mailto:bdawidow@redhat.com">Boleslaw Dawidowicz</a>
 */
public interface PageQuery extends Query<Page>
{
   //TODO: sortByProperty? Property value conditions?

   // Conditions

   PageQuery setName(String name);

   String getName();

   PageQuery setId(String name);

   String getId();

   PageQuery setTitle(String title);

   String getTitle();

   PageQuery setNavigation(Navigation navigation);

   Navigation getNavigation();


   // Query

   PageQuery reset();

   PageQuery immutable();

   PageQuery clone();

   int resultsCount();

   PageQuery sort(boolean ascending);

   PageQuery setRange(Range range);

   Range getRange();

   PageQuery nextPage();

   PageQuery previousPage();

   PageQuery firstPage();

   PageQuery lastPage();

}
