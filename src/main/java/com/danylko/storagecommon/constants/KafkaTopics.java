package com.danylko.storagecommon.constants;

import java.util.HashMap;
import java.util.Map;

public class KafkaTopics {

    public static final Map<String, String> topics = getTopics();

    private static Map<String, String> getTopics() {
        Map<String, String> topics = new HashMap<>();
        topics.put("customers_1", "customer_1");
        topics.put("order_stebnyk", "order_stebnyk");
        topics.put("order_lviv", "order_lviv");
        topics.put("order_drog", "order_drog");
        topics.put("product_stebnyk", "product_stebnyk");
        topics.put("product_lviv", "product_lviv");
        topics.put("product_drog", "product_drog");
        return topics;
    }
}
