object SimulateCheckout extends App {

  val checkout1 = new Checkout()
  checkout1.scan("HOODIE")
  checkout1.scan("TICKET")
  checkout1.scan("HAT")

  val checkout2 = new Checkout()
  checkout2.scan("HOODIE")
  checkout2.scan("HOODIE")
  checkout2.scan("HOODIE")
  checkout2.scan("HOODIE")
  checkout2.scan("TICKET")

  val checkout3 = new Checkout()
  checkout3.scan("HOODIE")
  checkout3.scan("HOODIE")
  checkout3.scan("HOODIE")
  checkout3.scan("TICKET")
  checkout3.scan("TICKET")
  checkout3.scan("TICKET")
  checkout3.scan("HAT")

  val checkout4 = new Checkout()
  checkout4.scan("TICKET")
  checkout4.scan("HOODIE")
  checkout4.scan("TICKET")

  checkout1.totalCost()
  checkout2.totalCost()
  checkout3.totalCost()
  checkout4.totalCost()
}