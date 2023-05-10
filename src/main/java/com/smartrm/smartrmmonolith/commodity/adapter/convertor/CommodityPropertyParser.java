package com.smartrm.smartrmmonolith.commodity.adapter.convertor;

/**
 * @author: hu
 * @description:
 */
public interface CommodityPropertyParser<T, V> {

  T parse(V content);

}
