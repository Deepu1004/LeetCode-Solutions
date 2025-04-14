class Solution:
    def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
        cnt = 0
        n = len(arr)
        i, j, k = 0, 1, 2

        while i < n - 2:
            if j >= n - 1:
                i += 1
                j = i + 1
                k = j + 1
                continue
            if k >= n:
                j += 1
                k = j + 1
                continue

            if abs(arr[i] - arr[j]) <= a and abs(arr[j] - arr[k]) <= b and abs(arr[i] - arr[k]) <= c:
                cnt += 1

            k += 1

        return cnt
