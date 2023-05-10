package com.smartrm.smartrmmonolith.commodity.domain.model;

import java.util.List;

/**
 * @author: hu
 * @description:
 */
public interface CommoditySchema {

  PropertySchema getPropertySchema(String fieldName);

  List<PropertySchema> getAllPropertySchemas();

}
