def sourceList = []
new File( 'input-file1.txt' ).eachLine { line ->
    sourceList << line.trim()
}

def targetList = []
new File( 'input-file2.txt' ).eachLine { line ->
    targetList << line.trim()
}

List diff1 = (sourceList-targetList)
List diff2 = (targetList-sourceList)
List diff3 = sourceList.intersect(targetList)

println "Total in sourceList: ${sourceList.size}"
println "Total in targetList: ${targetList.size}"


println "**** Items in sourceList not in targetList list: ${diff1.size} ****"
diff1.each { println "${it} \n" }


println "**** Items in targetList not in sourceList list: ${diff2.size} ****"
diff2.each { println "${it} \n" }



println "***** Common items: ${diff3.size} *****"
diff3.each { println "${it} \n" }
