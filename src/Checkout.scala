class Checkout {

  var ticket = new Product("TICKET", "Triggerise Ticket", 5.00)
  var hoodie = new Product("HOODIE", "Triggerise Hoodie", 20.00)
  var hat = new Product("HAT", "Triggerise Hat ", 7.50)

  val ticket_code = ticket.code
  val hoodie_code = hoodie.code
  val hat_code = hat.code

  var hoodieQuantity = 0
  var ticketQuantity = 0
  var hatQuantity = 0

  var cost = 0.0

  def scan(code : String): Unit ={
    code match {
      case `hoodie_code` =>
        hoodieQuantity += 1

      case `ticket_code` =>
        ticketQuantity += 1

      case `hat_code` =>
        hatQuantity += 1

      case _ =>
        println("No product exists")
    }
  }

  def hoodieSpecial(): Unit ={
    if (hoodieQuantity >= 3){
      hoodie.price = 19.00
    }
  }

  def ticketSpecial(): Unit = {
    if (ticketQuantity >= 2) {
      cost = cost - ticket.price
    }
  }

  def totalCost(): Unit = {
    hoodieSpecial()
    cost = (hoodieQuantity * hoodie.price) + (ticketQuantity * ticket.price) + (hatQuantity * hat.price)
    ticketSpecial()
    println("Total: " + cost)
  }


}
