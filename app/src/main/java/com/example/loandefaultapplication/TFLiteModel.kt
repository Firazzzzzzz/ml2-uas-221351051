package com.example.loandefaultapp

import android.content.Context
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel

class TFLiteModel(context: Context) {
    private val interpreter: Interpreter

    init {
        val model = loadModelFile(context, "loan_default.tflite")
        interpreter = Interpreter(model)
    }

    private fun loadModelFile(context: Context, filename: String): MappedByteBuffer {
        val fileDescriptor = context.assets.openFd(filename)
        val inputStream = FileInputStream(fileDescriptor.fileDescriptor)
        val fileChannel = inputStream.channel
        val startOffset = fileDescriptor.startOffset
        val declaredLength = fileDescriptor.declaredLength
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength)
    }

    fun predict(input: FloatArray): FloatArray {
        val inputArray = arrayOf(input)
        val output = Array(1) { FloatArray(2) }  // output model [1, 2]
        interpreter.run(inputArray, output)
        return output[0] // hasilnya FloatArray isi 2 nilai: [tidak_default, default]
    }
}
