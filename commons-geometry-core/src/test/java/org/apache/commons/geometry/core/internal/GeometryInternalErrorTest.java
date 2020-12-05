/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.geometry.core.internal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeometryInternalErrorTest {

    @Test
    public void testMessage() {
        // act
        final GeometryInternalError err = new GeometryInternalError();

        // assert
        final String msg = "An internal geometry error occurred. This most often indicates an " +
                "error in the algorithm implementation than in the calling code or data. Please file a bug report " +
                "with the developers.";

        Assertions.assertEquals(msg, err.getMessage());
    }
}
