package javascript
import js.jquery.*


fun main(args: Array<String>) {
    // will be automagically called when document is loaded
    jq {
        Kotlin2Javascript().fill()
    }
}

public class Kotlin2Javascript {
    fun fill(){
        val items = array("a","b","c")
        jq {
            val container = jq("#container")
            container.append("<b>Hello, World!</b>")
            container.append("<ul>")
            for(s in items)
                container.append("<li>$s</li>")

            container.append("</ul>")
        }
    }
}