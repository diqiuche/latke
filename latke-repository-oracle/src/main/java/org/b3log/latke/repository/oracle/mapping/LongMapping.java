/*
 * Copyright (c) 2009-2019, b3log.org & hacpai.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.repository.oracle.mapping;

import org.b3log.latke.repository.jdbc.mapping.Mapping;
import org.b3log.latke.repository.jdbc.util.FieldDefinition;

/**
 * Long type mapping.
 * <p>
 * <p>
 * Maps Java long type to SQL bigint type.
 * </p>
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.0, Feb 29, 2012
 */
public final class LongMapping implements Mapping {

    @Override
    public String toDataBaseSting(final FieldDefinition definition) {
        final StringBuilder sql = new StringBuilder();

        sql.append(definition.getName());
        sql.append(" decimal(20,0)");
        if (!definition.getNullable()) {
            sql.append(" not null");
        }

        return sql.toString();
    }
}
