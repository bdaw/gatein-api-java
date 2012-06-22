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

import org.gatein.api.exception.EntityAlreadyExistsException;
import org.gatein.api.exception.EntityNotFoundException;

/**
 * @author <a href="mailto:chris.laprun@jboss.com">Chris Laprun</a>
 * @author <a href="mailto:bdawidow@redhat.com">Boleslaw Dawidowicz</a>
 * @version $Revision$
 */
public interface Navigation extends Iterable<Node>
{
   Site getSite();

   int getPriority();

   void setPriority(int priority);

   Node getNode(String...path);

   boolean removeNode(String...path) throws EntityNotFoundException;

   Node addNode(String...path) throws EntityAlreadyExistsException;

   /**
    * The node count representing the child nodes of the root navigation.
    * @return the node count
    */
   int getNodeCount();

   //TODO: What's the use case here ?.
   void moveUp();

   void moveDown();
}
