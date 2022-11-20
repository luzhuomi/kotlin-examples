
// how to get functor?
fun main() {
    println("Hello, world!!!")
    ShowObj.showPoint().run{ // built-in run method makes the object extension method in-scope
        val p = Point(100.0f,10.0f)
        println(p.show())
    }
}

// type class
interface Show<T> {
    fun T.show() : String
}

class Point(val x:Float, val y:Float) {
    
}

// instance objects
object ShowObj {
    fun showPoint() : Show<Point> = ShowPoint 

    object ShowPoint : Show<Point> {
        override fun Point.show() : String {
            return this.x.toString() + " " + this.y.toString()
        }
    }
}

/* 
interface Functor<T<?>> {
    fun T<A>.map<A,B>(fun f:)
}
*/