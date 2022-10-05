#include <iostream>
#include <vector>
using namespace std;

int findDuplicate(vector<int> &nums)
{
    for (int index = 0; index < nums.size();)
    {
        if (nums[index] != index + 1)
        {
            int currentIndex = nums[index] - 1;
            if (nums[index] != nums[currentIndex])
            {
                swap(nums[index], nums[currentIndex]);
            }
            else
            {
                return nums[index];
            }
        }
        else
        {
            index++;
        }
    }
    return -1;
}

int main()
{
    int size;
    cin >> size;

    vector<int> nums(size);

    for(int index=0; index < size; index++) {
        cin >> nums[index];
    }

    int ans = findDuplicate(nums);
    cout << ans << endl;

    return 0;
}