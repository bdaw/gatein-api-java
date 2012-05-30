/*
 * JBoss, a division of Red Hat
 * Copyright 2011, Red Hat Middleware, LLC, and individual
 * contributors as indicated by the @authors tag. See the
 * copyright.txt in the distribution for a full listing of
 * individual contributors.
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


import org.gatein.api.commons.PropertyType;

/**
 * @author <a href="mailto:chris.laprun@jboss.com">Chris Laprun</a>
 * @author <a href="mailto:bdawidow@redhat.com">Boleslaw Dawidowicz</a>
 * @version $Revision$
 */
public interface Site
{

   Id getId();

   String getDisplayName();

   void setDisplayName(String displayName);

   String getDescription();

   void setDescription(String description);

   int getPriority();

   void setPriority(int priority);

   Navigation getNavigation();

   Page getPage(String pageName);

   //
   Navigation getNavigation(String navigationId);

   Navigation getNavigation(String... path);

   //TODO: Attributes

   <T> T getProperty(PropertyType<T> property);

   <T> void setProperty(PropertyType<T> property, T value);

   public class Id
   {
      private Type siteType;

      private String name;

      private Id(Type siteType, String name)
      {
         this.siteType = siteType;
         this.name = name;
      }

      public static Id create(Type siteType, String name)
      {
         return new Id(siteType, name);
      }

      public Type getSiteType()
      {
         return siteType;
      }

      public String getName()
      {
         return name;
      }


   }

   public static enum Type
   {
      PORTAL, GROUP, USER;
   }

}
