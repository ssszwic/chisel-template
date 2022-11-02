package project

import chisel3._
import chisel3.util._
import org.scalatest.flatspec.AnyFlatSpec
import scala.collection._
import chisel3.experimental._
import chisel3.stage.ChiselStage

class TopTest extends AnyFlatSpec with ChiselScalatestTester {
    behavior of "Top"
        it should "do something" in {
            test(new Top) { c =>
                // To-Do
            }
            println("SUCCESS!")
        }
}