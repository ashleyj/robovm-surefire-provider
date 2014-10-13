/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.robovm.junit.protocol;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Serialization for AtomicInteger
 */
public class AtomicIntegerTypeAdapter implements JsonSerializer<AtomicInteger>, JsonDeserializer<AtomicInteger> {

    @Override
    public AtomicInteger deserialize(JsonElement jsonElement, Type type,
            JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int intValue = jsonElement.getAsInt();
        return new AtomicInteger(intValue);
    }

    @Override
    public JsonElement serialize(AtomicInteger atomicInteger, Type type,
            JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(atomicInteger.get());
    }
}
