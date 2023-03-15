package com.kemalakkus.demirtasdesignproject.fragments

import android.animation.Animator
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.*

import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.kemalakkus.demirtasdesignproject.R
import com.kemalakkus.demirtasdesignproject.adapters.MyPagerAdapter
import com.kemalakkus.demirtasdesignproject.databinding.FragmentHomeBinding



class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val pageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            changeColor(position)
        }
    }



    private val images = listOf(
        R.drawable.moda1,
        R.drawable.moda2,
        R.drawable.moda1,
        R.drawable.moda2
    )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    
    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val adapter = MyPagerAdapter(images)
        binding.viewPagerHome.adapter = adapter

        binding.viewPagerHome.registerOnPageChangeCallback(pageChangeCallback)

        binding.viewPagerHome.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    binding.viewPagerHome.setTag(event.x)
                    false
                }
                MotionEvent.ACTION_MOVE -> {
                    false
                }
                MotionEvent.ACTION_UP -> {
                    val initialX = binding.viewPagerHome.getTag() as Float

                    if (event.x - initialX > dpToPx(150)) {
                        binding.viewPagerHome.setCurrentItem(binding.viewPagerHome.currentItem + 1, true)
                    }
                    true
                }
                else -> false
            }
        }



        }

    private fun changeColor(position: Int) {
        when (position) {
            0 -> {
                binding.view1.setBackgroundColor(Color.WHITE)
                binding.view2.setBackgroundColor(Color.GRAY)
                binding.view3.setBackgroundColor(Color.GRAY)
                binding.view4.setBackgroundColor(Color.GRAY)
            }
            1 -> {
                binding.view1.setBackgroundColor(Color.GRAY)
                binding.view2.setBackgroundColor(Color.WHITE)
                binding.view3.setBackgroundColor(Color.GRAY)
                binding.view4.setBackgroundColor(Color.GRAY)
            }
            2 -> {
                binding.view1.setBackgroundColor(Color.GRAY)
                binding.view2.setBackgroundColor(Color.GRAY)
                binding.view3.setBackgroundColor(Color.WHITE)
                binding.view4.setBackgroundColor(Color.GRAY)
            }
            3 -> {
                binding.view1.setBackgroundColor(Color.GRAY)
                binding.view2.setBackgroundColor(Color.GRAY)
                binding.view3.setBackgroundColor(Color.GRAY)
                binding.view4.setBackgroundColor(Color.WHITE)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }




    private fun dpToPx(dp: Int): Float {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), resources.displayMetrics
        )
    }

}
