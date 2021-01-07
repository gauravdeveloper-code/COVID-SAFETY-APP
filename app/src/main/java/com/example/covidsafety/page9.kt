package com.example.covidsafety

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.nfc.Tag
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.set
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.MultiFactor
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.Writer
import com.google.zxing.WriterException
import com.google.zxing.qrcode.encoder.QRCode
import kotlinx.android.synthetic.main.activity_flash_screen.*
import kotlinx.android.synthetic.main.activity_page9.*
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.jar.Manifest

private const val  tag="page9"
class page9 : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page9)
        generate_button.setOnClickListener {
            val name = name_qr.text.toString()
            val address = address_qr.text.toString()
            val phone = phone_number_qr.text.toString()
            val gateid = gateid_qr.text.toString()
            val userscore = intent.getIntExtra(Constants.TOTAL_SCORE, 0)

            val score0= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 0%"
            val score1= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 8.33%"
            val score2= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 16.66%"
            val score3= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 25%"
            val score4= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 33.33%"
            val score5= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 41.65%"
            val score6= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 50%"
            val score7= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 58.33%"
            val score8= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 66.66%"
            val score9= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 75%"
            val score10= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 83.33%"
            val score11= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 91.66%"
            val score12= "NAME = $name\n\nADDRESS = $address\n\nPHONE NO. = $phone\n\nGATE.ID = $gateid\n\nPERCENTAGE CHANCES = 100%"

            if (name.isBlank()) {
                Toast.makeText(this,"Enter name to generate QR",Toast.LENGTH_SHORT).show()
            }
            else if (address.isBlank()) {
                Toast.makeText(this,"Enter address to generate QR",Toast.LENGTH_SHORT).show()
            }
           else if (phone.isBlank()) {
                Toast.makeText(this,"Enter phone number to generate QR",Toast.LENGTH_SHORT).show()
            }
            else if (gateid.isBlank()) {
                Toast.makeText(this,"Enter Gate ID to generate QR",Toast.LENGTH_SHORT).show()
            }
            else {
                if(userscore==0) {
                    val bitmap = generateQRCode(score0)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==1) {
                    val bitmap = generateQRCode(score1)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==2) {
                    val bitmap = generateQRCode(score2)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==3) {
                    val bitmap = generateQRCode(score3)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==4) {
                    val bitmap = generateQRCode(score4)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==5) {
                    val bitmap = generateQRCode(score5)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==6) {
                    val bitmap = generateQRCode(score6)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==7) {
                    val bitmap = generateQRCode(score7)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==8) {
                    val bitmap = generateQRCode(score8)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==9) {
                    val bitmap = generateQRCode(score9)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==10) {
                    val bitmap = generateQRCode(score10)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==11) {
                    val bitmap = generateQRCode(score11)
                    QRIMAGE.setImageBitmap(bitmap)
                }
                if(userscore==12) {
                    val bitmap = generateQRCode(score12)
                    QRIMAGE.setImageBitmap(bitmap)
                }
            }
        }

        back_main.setOnClickListener {
            startActivity(
                Intent(this, browseractivities::class.java)
            )
            finish()
        }

    }
    fun createImageFile(bitmapScaled:Bitmap?){
        val bytes=ByteArrayOutputStream()
        bitmapScaled?.compress(Bitmap.CompressFormat.PNG,40,bytes)
        val filepath:String=Environment.getExternalStorageDirectory().absolutePath+File.separator+"Codeandroid.png"
        val f=File(filepath)
        f.createNewFile()
        val fo=FileOutputStream(f)
        fo.write(bytes.toByteArray())
        fo.close()
    }

    private fun generateQRCode(name:String):Bitmap{
        val width=300
        val height=300
        val bitmap=Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888)
        val codeWriter=MultiFormatWriter()
        try{
            val bitMatrix=codeWriter.encode(name,BarcodeFormat.QR_CODE,width,height)
            for(x in 0 until width){
                for (y in 0 until height){
                    bitmap.setPixel(x,y,if(bitMatrix[x,y])Color.BLACK else Color.WHITE)
                }
            }
        }catch (e:WriterException){
            Log.d(tag,"GenerateQRcode:${e.message}")
        };return bitmap
    }
}