package com.best.a72k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var textInputLayout1: TextInputLayout
    lateinit var textInputLayout2: TextInputLayout
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.edit1)
        editText2 = findViewById(R.id.edit2)
        textInputLayout1 = findViewById(R.id.inputId1)
        textInputLayout2 = findViewById(R.id.inputId2)
        open()
        openDetail()

    }

    private fun open() {
        editText1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if (p0?.length!! > textInputLayout1.counterMaxLength) {
                    textInputLayout1.error = "At least ${textInputLayout1.counterMaxLength}"
                }else{
                    textInputLayout1.error
                }
            }

        })
    }
    private fun openDetail() {
        editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if (p0?.length!! > textInputLayout2.counterMaxLength) {
                    textInputLayout2.error = "At least ${textInputLayout2.counterMaxLength}"
                }else{
                    textInputLayout2.error
                }
            }

        })
    }
}