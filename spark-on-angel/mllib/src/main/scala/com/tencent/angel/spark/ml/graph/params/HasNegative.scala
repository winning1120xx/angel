package com.tencent.angel.spark.ml.graph.params

import org.apache.spark.ml.param.{IntParam, Params}

trait HasNegative extends Params{
  /**
    * Param for buffer size.
    *
    * @group param
    */
  final val negative = new IntParam(this, "negative", "negative")

  /** @group getParam */
  final def getNegative: Int = $(negative)

  setDefault(negative, 5)

  /** @group setParam */
  final def setNegative(size: Int): this.type = set(negative, size)
}
