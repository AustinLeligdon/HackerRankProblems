=begin
A hash object called hackerrank is already created
1. A key-value pair [543121, 100] to the hackerrank object using store
2. Retain all key-value pairs where keys are Integers ( clue : is_a? Integer )
3. Delete all key-value pairs where keys are even-valued.
=end

hackerrank.store(543121, 100)
hackerrank.keep_if {|key, value| key.is_a? Integer}
hackerrank.delete_if {|key, value| key % 2 == 0}