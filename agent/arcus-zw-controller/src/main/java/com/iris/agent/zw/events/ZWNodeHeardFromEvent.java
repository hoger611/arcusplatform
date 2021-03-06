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
package com.iris.agent.zw.events;

/**
 * Event fired when a node is heard from.
 * 
 * @author Erik Larson
 */
public class ZWNodeHeardFromEvent implements ZWEvent {
   private final int nodeId;
   
   public ZWNodeHeardFromEvent(int nodeId) {
      this.nodeId = nodeId;
   }

   @Override
   public ZWEventType getType() {
      return ZWEventType.HEARD_FROM;
   }
   
   public int getNodeId() {
      return nodeId;
   }
}
