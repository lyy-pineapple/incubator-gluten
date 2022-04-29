/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.glutenproject.expression

import io.glutenproject.substrait.expression.ExpressionNode

import org.apache.spark.sql.catalyst.expressions.{CurrentDate, CurrentTimestamp, DateDiff, DayOfMonth, DayOfWeek, DayOfYear, Expression, Hour, MakeDate, MakeTimestamp, MicrosToTimestamp, MillisToTimestamp, Minute, Month, Now, Second, SecondsToTimestamp, UnixDate, UnixMicros, UnixMillis, UnixSeconds, UnixTimestamp, Year}
import org.apache.spark.sql.internal.SQLConf
import org.apache.spark.sql.types.{DateType, TimestampType}

object DateTimeExpressionsTransformer {
  class CurrentTimestampTransformer() extends CurrentTimestamp with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class CurrentDateTransformer(timeZoneId: Option[String] = None) extends CurrentDate(timeZoneId)
      with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class NowTransformer() extends Now()
      with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class HourTransformer(child: Expression, timeZoneId: Option[String] = None)
    extends Hour(child, timeZoneId) with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class MinuteTransformer(child: Expression, timeZoneId: Option[String] = None)
    extends Minute(child, timeZoneId) with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class SecondTransformer(child: Expression, timeZoneId: Option[String] = None)
    extends Second(child, timeZoneId) with ExpressionTransformer {
    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class DayOfMonthTransformer(child: Expression) extends DayOfMonth(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class DayOfYearTransformer(child: Expression) extends DayOfYear(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class DayOfWeekTransformer(child: Expression) extends DayOfWeek(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class MonthTransformer(child: Expression) extends Month(child) with
      ExpressionTransformer {
    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class YearTransformer(child: Expression) extends Year(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class UnixDateTransformer(child: Expression) extends UnixDate(child) with
      ExpressionTransformer {
    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class UnixSecondsTransformer(child: Expression) extends UnixSeconds(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class UnixMillisTransformer(child: Expression) extends UnixMillis(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class UnixMicrosTransformer(child: Expression) extends UnixMicros(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class SecondsToTimestampTransformer(child: Expression) extends SecondsToTimestamp(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class MillisToTimestampTransformer(child: Expression) extends MillisToTimestamp(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class MicrosToTimestampTransformer(child: Expression) extends MicrosToTimestamp(child) with
      ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  /**
   * Converts time string with given pattern to Unix time stamp (in seconds), returns null if fail.
   */
  class UnixTimestampTransformer(left: Expression, right: Expression)
      extends UnixTimestamp(left, right) with
      ExpressionTransformer {
    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class DateDiffTransformer(left: Expression, right: Expression)
      extends DateDiff(left, right) with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  class MakeDateTransformer(
      year: Expression,
      month: Expression,
      day: Expression,
      failOnError: Boolean = SQLConf.get.ansiEnabled)
      extends MakeDate(year, month, day, failOnError) with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }
  class MakeTimestampTransformer(
      year: Expression,
      month: Expression,
      day: Expression,
      hour: Expression,
      min: Expression,
      sec: Expression,
      timezone: Option[Expression] = None,
      timeZoneId: Option[String] = None,
      failOnError: Boolean = SQLConf.get.ansiEnabled)
      extends MakeTimestamp(year, month, day, hour, min, sec, timezone, timeZoneId, failOnError)
          with ExpressionTransformer {

    override def doTransform(args: java.lang.Object): ExpressionNode = {
      throw new UnsupportedOperationException("Not supported.")
    }
  }

  def castTimestampFromDate(child: Expression,
      timeZoneId: Option[String] = None): ExpressionTransformer = {
    new CastTransformer(child, DateType, timeZoneId, null)
  }

  def castDateFromTimestamp(child: Expression,
      timeZoneId: Option[String] = None): ExpressionTransformer = {
    new CastTransformer(child, TimestampType, timeZoneId, null)
  }
}
