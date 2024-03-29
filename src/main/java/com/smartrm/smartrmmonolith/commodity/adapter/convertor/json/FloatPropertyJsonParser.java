package com.smartrm.smartrmmonolith.commodity.adapter.convertor.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.smartrm.smartrmmonolith.commodity.adapter.convertor.CommodityPropertyParser;
import com.smartrm.smartrmmonolith.commodity.infrastructure.CommodityError;
import com.smartrm.smartrmmonolith.infracore.exception.DomainException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author: hu
 * @description:
 */
public class FloatPropertyJsonParser implements
    CommodityPropertyParser<Double, JsonNode> {

  @Override
  public Double parse(JsonNode fieldNode) {
    if (fieldNode == null || fieldNode.isNull()) {
      return null;
    }

    if (!fieldNode.isValueNode()) {
      throw new DomainException(CommodityError.CommodityParseError);
    }

    String content = fieldNode.asText();
    if (StringUtils.isBlank(content)) {
      return null;
    }

    try {
      return NumberUtils.createDouble(content);
    } catch (NumberFormatException e) {
      throw new DomainException(CommodityError.CommodityParseError);
    }
  }
}
