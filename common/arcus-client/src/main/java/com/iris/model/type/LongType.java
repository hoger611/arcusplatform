/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iris.model.type;

import java.lang.reflect.Type;

import org.apache.commons.lang3.reflect.TypeUtils;

public enum LongType implements PrimitiveType {
   INSTANCE;

   @Override
   public String getTypeName() {
      return "long";
   }

   @Override
   public Class<Long> getJavaType() {
      return Long.class;
   }

   @Override
   public Long coerce(Object obj) {
      if(obj == null) {
         return null;
      }

      if(obj instanceof Number) {
         return ((Number) obj).longValue();
      }

      if(obj instanceof String) {
         return Long.valueOf((String) obj);
      }

      throw new IllegalArgumentException("Cannot coerce object of type " + obj.getClass() + " to " + getTypeName());
   }

   @Override
   public boolean isAssignableFrom(Type type) {
      if(type == null) {
         return false;
      }
      return 
            Long.class.equals(type) || 
            String.class.equals(type) || 
            Number.class.isAssignableFrom(TypeUtils.getRawType(type, null));
   }

   @Override
   public String toString() {
      return "long";
   }
   
}

