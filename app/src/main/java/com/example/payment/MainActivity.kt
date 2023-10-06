package com.example.payment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.payment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
 //   private lateinit var stripe: Stripe
   // lateinit var  binding = A
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.cardInputWidget.cardNumberEditText.isCardNumberValid
//        PaymentConfiguration.init(
//            applicationContext,
//            "pk_test_51NxnxECLWhJw88cUOxu6p01SWclQyWM5x6CrWXYYE50EBJg9N3YwGnB6jWBrbzPoklnbed3iSmFBmm5Rp3xJIy6i00bN9lKfJz"
//        )

      //  stripe = Stripe(applicationContext, PaymentConfiguration.getInstance(applicationContext).publishableKey)

     //   stripe = Stripe(this, PaymentConfiguration.getInstance(this).publishableKey)

    }
}
/*
*
*
* import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stripe.android.Stripe
import com.stripe.android.model.Card
import com.stripe.android.view.CardInputWidget
import com.stripe.android.view.CardMultilineWidget
import com.stripe.android.view.CardValidCallback
import com.stripe.android.view.PaymentMethodsActivityStarter
import kotlinx.android.synthetic.main.activity_payment.*
import java.util.*

class PaymentActivity : AppCompatActivity() {
    private lateinit var stripe: Stripe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        // Initialize the Stripe object
        stripe = Stripe(this, PaymentConfiguration.getInstance(this).publishableKey)

        // Set up the CardMultilineWidget
        val cardInputWidget = findViewById<CardMultilineWidget>(R.id.cardInputWidget)
        cardInputWidget.setCardValidCallback(object : CardValidCallback {
            override fun onCardValid(card: Card) {
                // Card is valid, you can proceed with payment
                // You can access card information using card object
                // For example: card.number, card.expiryMonth, card.expiryYear, card.cvc
            }
        })

        // Set up a button click listener to process the payment
        submitButton.setOnClickListener {
            val cardToSave = cardInputWidget.card
            if (cardToSave != null) {
                // Create a PaymentMethod using the card details
                val paymentMethodCreateParams = PaymentMethodCreateParams.create(cardToSave.toPaymentMethodParamsCard(), null)

                // You can also attach additional data to the PaymentMethodCreateParams

                // Create the PaymentMethod using the Stripe SDK
                stripe.createPaymentMethod(
                    paymentMethodCreateParams,
                    object : ApiResultCallback<PaymentMethod> {
                        override fun onSuccess(result: PaymentMethod) {
                            // PaymentMethod created successfully
                            // You can now use the result.id to make a payment
                            val paymentMethodId = result.id
                            // Process the payment using the paymentMethodId
                        }

                        override fun onError(e: Exception) {
                            // Handle error
                        }
                    }
                )
            }
        }
    }
}

*
*
*
* */