package project

import chisel3._
import chisel3.util._
import org.scalatest.flatspec.AnyFlatSpec
import scala.collection._
import chisel3.experimental._
import chisel3.stage.ChiselStage


class Top extends Module {
    val io = IO(new Bundle {
        
    })
    // To-Do
}

// generate module
object main extends App {
    val param = Array("--target-dir", "generated", 
                    "--emit-modules", "verilog")
    (new ChiselStage).emitVerilog(new DesignModule, param)

    // printf verilog to stdout
    // println{getVerilogString(new Decoupled)}
}
