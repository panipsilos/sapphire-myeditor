/******************************************************************************
 * Copyright (c) 2014 Oracle
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Shenxue Zhou - initial implementation and ongoing maintenance
 *    Konstantin Komissarchik - miscellaneous improvements
 ******************************************************************************/

package org.eclipse.sapphire.samples.map;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.ReferenceValue;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.Reference;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.annotations.Service;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;
import org.eclipse.sapphire.samples.map.internal.LocationReferenceService;

/**
 * @author <a href="mailto:shenxue.zhou@oracle.com">Shenxue Zhou</a>
 * @author <a href="mailto:konstantin.komissarchik@oracle.com">Konstantin Komissarchik</a>
 */

public interface Route extends Element 
{
    ElementType TYPE = new ElementType( Route.class );
    
    // *** FromLocation ***
    
    @Reference( target = Location.class )
    @Service( impl = LocationReferenceService.class )
    @XmlBinding( path = "from")
    @Required
    @Label(standard = "from location")

    ValueProperty PROP_FROM_LOCATION = new ValueProperty( TYPE, "FromLocation" );

    ReferenceValue<String,Location> getFromLocation();
    void setFromLocation( String name );
    
    // *** ToLocation ***
    
    @Reference( target = Location.class )
    @Service( impl = LocationReferenceService.class )
    @XmlBinding( path = "to")
    @Required
    @Label(standard = "to location")

    ValueProperty PROP_TO_LOCATION = new ValueProperty( TYPE, "ToLocation" );

    ReferenceValue<String,Location> getToLocation();
    void setToLocation( String name );
    
    // *** Distance ***
    
    @XmlBinding( path = "distance" )
    @Label( standard = "distance" )
    @Required

    ValueProperty PROP_DISTANCE = new ValueProperty( TYPE, "Distance" );

    Value<String> getDistance();
    void setDistance( String distance );
    
}
