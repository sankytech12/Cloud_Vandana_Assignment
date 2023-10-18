function sortArrayDescending(arr) {
  const n = arr.length;

  for (let i = 1; i < n; i++) {
    const currentElement = arr[i];
    let j = i - 1;

    while (j >= 0 && arr[j] < currentElement) {
      arr[j + 1] = arr[j];
      j--;
    }

    arr[j + 1] = currentElement;
  }

  return arr;
}

const arr = [5, 2, 9, 1, 5, 6];
const sortedArr = sortArrayDescending(arr);
console.log(sortedArr);

/*
 Time complexity: 0(length of array^2)
 Space complexity: 0(1)
 */