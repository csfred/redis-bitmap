package com.leadsoft.redis.bitmap.controller;

import com.leadsoft.redis.bitmap.service.RedisBitmapServices;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author cs
 * @date 2021/02/28
 */
@RestController
@RequestMapping("/redis")
public class RedisBitmapController {

    @Resource
    private RedisBitmapServices checkInService;

    @RequestMapping("/checkIn")
    public String checkIn(@RequestParam(name = "userId") Long userId) {
        checkInService.checkIn(userId);
        return "SUCCESS";
    }

    @GetMapping("/count")
    public Long countDateCheckIn(String date) {
        return checkInService.countDateCheckIn(date);
    }

    @GetMapping("/{userId}")
    public Long countCheckIn(@PathVariable(name =  "userId") Long userId,
                             @RequestParam(name = "startDate", required = true) String startDate,
                             @RequestParam(name = "endDate", required = true) String endDate) {
        return checkInService.countCheckIn(userId, startDate, endDate);
    }

    @GetMapping("/continuousdays/{userId}")
    public long getContinuousCheckIn(@PathVariable(name = "userId") Long userId) {
        return checkInService.getContinuousCheckIn(userId);
    }
}
