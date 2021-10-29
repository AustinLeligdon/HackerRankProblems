# In this challenge, your task is to determine what the take method does. Study the examples below, then implement the method.
# > take([1,2,3], 1)
# [2, 3]
# > take([1,2,3], 2)
# [3]
# > take([1,2,3])
# [2, 3]
def take(arr, num_dropped=1)
  arr.drop(num_dropped)
end
