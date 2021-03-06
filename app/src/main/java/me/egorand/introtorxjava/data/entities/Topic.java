/*
 * Copyright 2016 Egor Andreevici
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

package me.egorand.introtorxjava.data.entities;

import android.support.annotation.StringRes;

import me.egorand.introtorxjava.R;

public enum Topic {

    CREATING_OBSERVABLES(R.string.topic_creating_observables),
    DEBUGGING(R.string.topic_debugging),
    RETROFIT(R.string.topic_retrofit);

    public final @StringRes int titleRes;

    Topic(int titleRes) {
        this.titleRes = titleRes;
    }
}
