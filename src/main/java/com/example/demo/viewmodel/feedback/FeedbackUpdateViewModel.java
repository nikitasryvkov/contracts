package com.example.demo.viewmodel.feedback;

import com.example.demo.forms.done.FeedbackUpdateForm;
import com.example.demo.viewmodel.pages.BaseViewModel;

public record FeedbackUpdateViewModel(
        BaseViewModel base,
        FeedbackUpdateForm form) {
}
