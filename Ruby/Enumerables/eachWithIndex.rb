#Return all animals with index greater than the skip value

def skip_animals(animals, skip)
    #initalize
    arr = []

    #Index and push to array if greater than skip value
    animals.each_with_index {|animal, index|
        if (index >= skip)
            arr.push("#{index}:#{animal}")
        end
    }

    #Optional print out array values
    #arr.each {|animal| p animal}

    return arr
end