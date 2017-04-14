/**
 * Copyright 2017 Institute of Computing Technology, Chinese Academy of Sciences.
 * Licensed under the terms of the Apache 2.0 license.
 * Please see LICENSE file in the project root for terms
 */
package bda.studio.client.ui.binding;

import bda.studio.client.ui.panel.component.DescribeGrid;
import bda.studio.shared.model.Dataset;

/**
 * a binder bind a DescribeGrid and a Dataset object together
 */
public interface DatasetBinder extends TextBinder<DescribeGrid, Dataset> {

}