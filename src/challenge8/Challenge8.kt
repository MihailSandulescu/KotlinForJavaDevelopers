package challenge8

import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream

fun main() {
//    val lines = File("testfile.txt").reader().use { it.readText() }

    File(".").walkTopDown().forEach {
        try {
            val di = DataInputStream(FileInputStream(it.name))
        } catch(e: Exception) {
            println(e.message)
        }
    }
}