=begin
In this challenge, you have been provided with a custom object called colors that defines its own each method.
You need to iterate over the items and return an Array containing the values.
=end

def iterate_colors(colors)
    arr = []
    colors.each {|color| arr.push(color)}
    return arr
end