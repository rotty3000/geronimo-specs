/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package javax.xml.rpc.holders;

/**
 * Holder for <code>Short</code>s.
 *
 * @version $Rev$ $Date$
 */
public final class ShortWrapperHolder implements Holder {

    /** The <code>Short</code> contained by this holder. */
    public Short value;

    /**
     * Make a new <code>ShortWrapperHolder</code> with a <code>null</code> value.
     */
    public ShortWrapperHolder() {}

    /**
     * Make a new <code>ShortWrapperHolder</code> with <code>value</code> as
     * the value.
     *
     * @param value  the <code>Short</code> to hold
     */
    public ShortWrapperHolder(Short value) {
        this.value = value;
    }
}
