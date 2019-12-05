sealed class Command (){
    object Left: Command()
    object Right: Command()
    object Move: Command()
}