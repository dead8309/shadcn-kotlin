package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.*
import web.cssom.ClassName

data class Invoices(
    val invoice: String,
    val paymentStatus: String,
    val totalAmount: String,
    val paymentMethod: String,
)

val invoices = listOf(
    Invoices(
        invoice = "INV001",
        paymentStatus = "Paid",
        totalAmount = "$250.00",
        paymentMethod = "Credit Card",
    ),
    Invoices(
        invoice = "INV002",
        paymentStatus = "Pending",
        totalAmount = "$150.00",
        paymentMethod = "PayPal",
    ),
    Invoices(
        invoice = "INV003",
        paymentStatus = "Unpaid",
        totalAmount = "$350.00",
        paymentMethod = "Bank Transfer",
    ),
    Invoices(
        invoice = "INV004",
        paymentStatus = "Paid",
        totalAmount = "$450.00",
        paymentMethod = "Credit Card",
    ),
    Invoices(
        invoice = "INV005",
        paymentStatus = "Paid",
        totalAmount = "$550.00",
        paymentMethod = "PayPal",
    ),
    Invoices(
        invoice = "INV006",
        paymentStatus = "Pending",
        totalAmount = "$200.00",
        paymentMethod = "Bank Transfer",
    ),
    Invoices(
        invoice = "INV007",
        paymentStatus = "Unpaid",
        totalAmount = "$300.00",
        paymentMethod = "Credit Card",
    ),
)
val TableDemo = FC<Props> {
    Table {
        TableCaption { + "A list of your recent invoices ."}
        TableHeader {
            TableRow {
                TableHead {
                    className = ClassName("w-[100px]")
                    +"Invoice"
                }
                TableHead { +"Status" }
                TableHead { +"Method" }
                TableHead {
                    className = ClassName("text-right")
                    +"Amount"
                }
            }
        }
        TableBody {
            invoices.forEach {
                TableRow {
                    key = it.invoice
                    TableCell {
                        className = ClassName("font-medium")
                        + it.invoice
                    }
                    TableCell { + it.paymentStatus }
                    TableCell { + it.paymentMethod }
                    TableCell {
                        className = ClassName("text-right")
                        + it.totalAmount
                    }
                }
            }
        }
    }
}