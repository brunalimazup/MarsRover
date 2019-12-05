class Controller() {
    val dimension by lazy {
        Dimension(5, 5)
    }
	
	fun direction (){
		
		
	}

    fun execution() {

        var L = Command.Left
        var R = Command.Right
        var M = Command.Move

        var E = Direction.East
        var N = Direction.North
        var S = Direction.South
        var W = Direction.West

	fun executeDirection (direction: Direction) {
		 when (direction){
			  E -> print ("E")
			  N -> print ("N")
			  S -> print ("S")
			  W -> print ("W")
			    else -> throw IllegalMoveException()
			}
	}
		
		fun executeCommand (command: Command) {
		 when (command){
			  L -> {
				  print ("L")
				 
					}
			  R -> print ("R")
			  M -> print ("M")
			    else -> throw IllegalMoveException()
			}
			
		}
            fun rover() {
                val position = listOf(Rover(0, 0, N), Rover(1, 3, S))
                val command = listOf(L, R, M).toString()
				val direction = listOf(E,N,S,W).toString()
				
				command.forEach { element -> print ("$element")}
				direction.forEach { element1 -> print ("$element1")}
				position.forEach{elemen -> print ("$elemen")}
			}	  
	}
}




