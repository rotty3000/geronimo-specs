/*
 * #%L
 * Apache Geronimo JAX-RS Spec 2.0
 * %%
 * Copyright (C) 2003 - 2014 The Apache Software Foundation
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package javax.ws.rs.client;

import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Map;


public interface WebTarget extends Configurable<WebTarget> {


    URI getUri();


    UriBuilder getUriBuilder();


    WebTarget path(String path);


    WebTarget resolveTemplate(String name, Object value);


    WebTarget resolveTemplate(String name, Object value, boolean encodeSlashInPath);


    WebTarget resolveTemplateFromEncoded(String name, Object value);


    WebTarget resolveTemplates(Map<String, Object> templateValues);

    WebTarget resolveTemplates(Map<String, Object> templateValues, boolean encodeSlashInPath);


    WebTarget resolveTemplatesFromEncoded(Map<String, Object> templateValues);


    WebTarget matrixParam(String name, Object... values);


    WebTarget queryParam(String name, Object... values);


    Invocation.Builder request();


    Invocation.Builder request(String... acceptedResponseTypes);


    Invocation.Builder request(MediaType... acceptedResponseTypes);
}
