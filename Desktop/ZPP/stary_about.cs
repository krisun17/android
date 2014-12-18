@{
    ViewBag.Title = "Przewiduj Oceny";
}
<h2>@ViewBag.Title.</h2>
<h3>@ViewBag.Message</h3>

@model ZPP___frontend.Models.BaseSubjectsMarks
<div class="row">
    <div class="col-md-10">

       

        @using (Html.BeginForm("HandleForm", "Home"))
        {
            @Html.ValidationSummary(true)
        <br />

            <fieldset>

                <div class="editor-label">
                    @Html.LabelFor(Model => Model.am1Mark)
                </div>
                <div class="editor-field">
                    @Html.EditorFor(model => model.am1Mark)
                    @Html.ValidationMessageFor(model => model.am1Mark)
                </div>
                <div class="editor-label">
                    @Html.LabelFor(Model => Model.am2Mark)
                </div>
                <div class="editor-field">
                    @Html.EditorFor(Model => Model.am2Mark)
                </div>
                <div class="editor-label">
                    @Html.LabelFor(Model => Model.pmatMark)
                </div>
                <div class="editor-field">
                    @Html.EditorFor(model => model.pmatMark)
                </div>
                <div class="editor-label">
                    @Html.LabelFor(Model => Model.galMark)
                </div>
                <div class="editor-field">
                    @Html.EditorFor(Model => Model.galMark)
                </div>
                <div class="editor-label">
                    @Html.LabelFor(Model => Model.wpiMark)
                </div>
                <div class="editor-field">
                    @Html.EditorFor(model => model.wpiMark)
                </div>
                <div class="editor-label">
                    @Html.LabelFor(Model => Model.poMark)
                </div>
                <div class="editor-field">
                    @Html.EditorFor(Model => Model.poMark)
                </div>
                <div class="editor-label">
                    @Html.LabelFor(Model => Model.ippMark)
                </div>
                <div class="editor-field">
                    @Html.EditorFor(model => model.ippMark)
                </div>

            </fieldset>
            <p>
                <input type="submit" name="submit" value="Przewiduj oceny" id="predict_marks" />
            </p>
        }
    </div>
</div>