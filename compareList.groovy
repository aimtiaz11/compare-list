defsourceList=[]
newFile('input-file1.txt').eachLine{line->
sourceList<<line
}

deftargetList=[]
newFile('input-file2.txt').eachLine{line->
targetList<<line
}

Listdiff1=(sourceList-targetList)
Listdiff2=(targetList-sourceList)
Listdiff3=sourceList.intersect(targetList)

println"TotalinsourceList:${sourceList.size}"
println"TotalintargetList:${targetList.size}"


println"****ItemsinsourceListnotintargetListlist:${diff1.size}****"
diff1.each{println"${it}\n"}


println"****ItemsintargetListnotinsourceListlist:${diff2.size}****"
diff2.each{println"${it}\n"}



println"*****commonitems*****"
diff3.each{println"${it}\n"}